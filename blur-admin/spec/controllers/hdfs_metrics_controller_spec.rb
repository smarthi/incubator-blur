require 'spec_helper'

describe HdfsMetricsController do
  before(:each) do
    @ability = Ability.new User.new
    @ability.stub!(:can?).and_return(true)
    controller.stub!(:current_ability).and_return(@ability)
  end

  describe "actions" do
    before(:each) do
      @hdfs_index = FactoryGirl.create_list :hdfs, 2
      Hdfs.stub(:all).and_return(@hdfs_index)
    end

    describe "GET index" do
      it "should set @hdfs_index to Hdfs.All" do
        get :index
        assigns(:hdfs_index).should == @hdfs_index
      end
    end

    describe "PUT disk_cap_usage" do
      before(:each) do 
        @hdfs = FactoryGirl.create :hdfs_with_stats
      end

      it "put disk with only id should return all within last minute" do
        put :disk_cap_usage, :id => @hdfs.id
        assigns(:results).length.should == 1
      end

      it "put disk with only return the correct properties" do
        put :disk_cap_usage, :id => @hdfs.id
        assigns(:results)[0].attribute_names.should == ['id', 'created_at', 'present_capacity', 'dfs_used']
      end

      it "put disk with stat_mins = 2 should return all within last 2 minutes" do
        put :disk_cap_usage, :id => @hdfs.id, :stat_min => 2
        assigns(:results).length.should == 2
      end

      it "put disk with stat_id = @hdfs.hdfs_stats[1].id should return the last one" do
        put :disk_cap_usage, :id => @hdfs.id, :stat_id => @hdfs.hdfs_stats[1].id
        assigns(:results).length.should == 1
      end
    end

    describe "PUT live_dead_nodes" do
      before(:each) do 
        @hdfs = FactoryGirl.create :hdfs_with_stats
      end

      it "put nodes with only id should return all within last minute" do
        put :live_dead_nodes, :id => @hdfs.id
        assigns(:results).length.should == 1
      end

      it "put disk with only return the correct properties" do
        put :live_dead_nodes, :id => @hdfs.id
        assigns(:results)[0].attribute_names.should == ['id', 'created_at', 'live_nodes', 'dead_nodes']
      end

      it "put disk with stat_mins = 2 should return all within last 2 minutes" do
        put :live_dead_nodes, :id => @hdfs.id, :stat_min => 2
        assigns(:results).length.should == 2
      end

      it "put disk with stat_id = @hdfs.hdfs_stats[1].id should return the last one" do
        put :live_dead_nodes, :id => @hdfs.id, :stat_id => @hdfs.hdfs_stats[1].id
        assigns(:results).length.should == 1
      end
    end

    describe "PUT block_info" do
      before(:each) do 
        @hdfs = FactoryGirl.create :hdfs_with_stats
      end

      it "put nodes with only id should return all within last minute" do
        put :block_info, :id => @hdfs.id
        assigns(:results).length.should == 1
      end

      it "put disk with only return the correct properties" do
        put :block_info, :id => @hdfs.id
        assigns(:results)[0].attribute_names.should == ['id', 'created_at', 'under_replicated', 'corrupt_blocks']
      end

      it "put disk with stat_mins = 2 should return all within last 2 minutes" do
        put :block_info, :id => @hdfs.id, :stat_min => 2
        assigns(:results).length.should == 2
      end

      it "put disk with stat_id = @hdfs.hdfs_stats[1].id should return the last one" do
        put :block_info, :id => @hdfs.id, :stat_id => @hdfs.hdfs_stats[1].id
        assigns(:results).length.should == 1
      end
    end
  end
end
