require 'spec_helper'

describe ZookeepersController do
  describe "actions" do
    before do
      @ability = Ability.new User.new
      @ability.stub!(:can?).and_return(true)
      controller.stub!(:current_ability).and_return(@ability)

      # Set up association chain
      @zookeeper  = FactoryGirl.create :zookeeper

      # ApplicationController.current_zookeeper
      Zookeeper.stub(:find_by_id).and_return(@zookeeper)
      Zookeeper.stub!(:first).and_return(@zookeeper)
      # ApplicationController.zookeepers
      Zookeeper.stub(:order).and_return [@zookeeper]
    end

    describe 'GET index' do
      it "assigns the collection all zookeepers to @zookeepers" do
        Zookeeper.stub_chain(:select, :order).and_return [@zookeeper]
        get :index
        assigns(:zookeepers).should == [@zookeeper]
      end
      it "renders the index template" do
        get :index
        response.should render_template 'index'
      end
    end

    describe 'GET show' do
      it "assigns the current zookeeper to @zookeeper" do
        get :show
        assigns(:zookeeper).should == @zookeeper
      end

      it "assigns the current zookeeper to @zookeeper" do
        get :show, :id => @zookeeper
        assigns(:zookeeper).should == @zookeeper
        session[:current_zookeeper_id].should == @zookeeper.id
      end

      it "assigns the shards nodes and the controller nodes" do
        @zookeeper.stub_chain(:shards, :count).and_return(1)
        @zookeeper.stub_chain(:controllers, :count).and_return(1)
        get :show
        assigns(:shard_nodes).should == 1
        assigns(:controller_nodes).should == 1
      end

      it "renders the show_current view" do
        get :show
        response.should render_template :show
      end

      describe "testing ApplicationController current ZK logic" do
        it "with only one zookeeper it should set the current_zookeeper to be the first zookeeper found" do
          Zookeeper.should_receive(:first)
          get :show, nil, nil
          assigns(:current_zookeeper).should == @zookeeper
          session[:current_zookeeper_id].should == @zookeeper.id
        end

        it "with more than one zookeeper it should set the current_zookeeper to be the ZK with the session ID" do
          session[:current_zookeeper_id] = 1
          Zookeeper.should_receive(:find_by_id).with(1).and_return @zookeeper
          Zookeeper.stub!(:count).and_return(2)
          get :show, nil, nil
          assigns(:current_zookeeper).should == @zookeeper
          session[:current_zookeeper_id].should == @zookeeper.id
        end

        it "should not set the session ID if no ZK is found and should redirect to the root path" do
          Zookeeper.stub!(:first).and_return nil
          get :show, nil, nil
          assigns(:current_zookeeper).should == nil
          session[:current_zookeeper_id].should == nil
          response.should redirect_to :root
        end

        it "should not set the session ID if no ZK is found and should redirect to the root path for xhr requests" do
          Zookeeper.stub!(:first).and_return nil
          xhr :get, :show, nil, nil
          assigns(:current_zookeeper).should == nil
          session[:current_zookeeper_id].should == nil
          response.response_code.should == 409
        end
      end
    end

    describe 'GET dashboard' do
      it "collects the long queries data" do
        pending 'need to test that all the different aspects of the query are being returned'
        get :dashboard
      end

      it "renders a json object" do
        get :dashboard
        response.content_type.should == 'application/json'
      end
    end

    describe 'DELETE destroy_shard' do
      before(:each) do
        Shard.stub!(:destroy)
      end

      it "calls destroy on the shards model" do
        Shard.should_receive(:destroy).with('1')
        delete :destroy_shard, :shard_id => 1, :id => 1
      end

      it "redirects to the zookeeper page" do
        delete :destroy_shard, :shard_id => 1, :id => 1
        response.should redirect_to :zookeeper
      end
    end

    describe 'DELETE destroy_cluster' do
      before(:each) do
        Cluster.stub!(:destroy)
      end

      it "calls destroy on the clusters model" do
        Cluster.should_receive(:destroy).with('1')
        delete :destroy_cluster, :cluster_id => 1, :id => 1
      end

      it "redirects to the zookeeper page" do
        delete :destroy_cluster, :cluster_id => 1, :id => 1
        response.should redirect_to :zookeeper
      end
    end

    describe 'DELETE destroy_controller' do
      before(:each) do
        Controller.stub!(:destroy)
      end

      it "calls destroy on the Controller model" do
        Controller.should_receive(:destroy).with('1')
        delete :destroy_controller, :controller_id => 1, :id => 1
      end

      it "redirects to the zookeeper page" do
        delete :destroy_controller, :controller_id => 1, :id => 1
        response.should redirect_to :zookeeper
      end
    end

    describe 'DELETE destroy_zookeeper' do
      before(:each) do
        Zookeeper.stub!(:destroy)
      end

      it "calls destroy on the Zookeeper model" do
        Zookeeper.should_receive(:destroy).with('1')
        delete :destroy_zookeeper, :id => 1
      end

      it "redirects to the zookeeper page" do
        delete :destroy_zookeeper, :id => 1
        response.should redirect_to :zookeeper
      end
    end
  end
end