require 'calabash-android/calabash_steps'

Given /^calendarioURJC home screen$/ do
    res = query("fragment: 'navigation_home'")
end
When /^I press 'help' button$/ do

end
Then /^I see the help View$/ do
    perform_action('')
end
When /^I scroll down$/ do

end
Then /^I see all the help info$/ do

end

Given /^Dashboard screen$/ do

end
When /^I press 'eventos' button$/ do

end
And /^there is an event created$/ do

end
Then /^I see the List of my events$/ do

end
When /^I press 'ver' button$/ do

end
Then /^the event is shown$/ do

end

When /^I press 'calendario' button$/ do

end
Then /^I see a calendar$/ do

end
When /^I press the the Arrow of next month$/ do

end
Then /^I see the next month$/ do

end