require 'spec_helper'

describe "environment status" do
  # generate a valid user
  let(:user) { Factory.create :user }

  before do
    @zookeepers = Array.new(3).collect {Factory.create :zookeeper_with_blur_tables}
    visit login_path
    fill_in 'Username', :with => user.username
    fill_in 'Password', :with => user.password
    click_button 'Log In'
    @zookeeper = @zookeepers[1]
    visit "/zookeepers/#{@zookeeper.id}"
  end

  it "shows a current zookeeper selector in the header" do
    @zookeepers.each do |zookeeper|
      find("#top").find("[value='#{@zookeeper.id}']").should have_content @zookeeper.name
    end
  end

  it "displays the name and connection information of the current zookeeper" do
    find('#zookeeper').should have_content @zookeeper.name
    find('#zookeeper').should have_content @zookeeper.url
  end

  it "shows every controller and associated version" do
    @zookeeper.controllers.each do |controller|
      page.should have_content controller.node_name
      page.should have_content controller.blur_version
    end
  end

  it "shows every controller and associated version" do
    @zookeeper.shards.each do |shard|
      page.should have_content shard.node_name
      page.should have_content shard.blur_version
    end
  end

  it "displays warnings if blur versions are not consistent" do
    if @zookeeper.controllers.count('DISTINCT blur_version') > 1
      page.should have_content "Controllers are not running the same blur version"
    end
    if @zookeeper.shards.count('DISTINCT blur_version') > 1
      page.should have_content "Shards are not running the same blur version"
    end
  end
end
