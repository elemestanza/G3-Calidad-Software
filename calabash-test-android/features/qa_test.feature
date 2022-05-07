Feature: QA Test

    Scenario: See help View 
        Given calendarioURJC home screen
        When I press 'help' button
        Then I see the help View
        When I scroll down
        Then I see all the help info

    Scenario: See an event
        Given Dashboard screen
        When I press 'eventos' button
        And there is an event created
        Then I see the List of my events
        When I press 'ver' button
        Then the event is shown

    Scenario: See Calendario View
        Given Dashboard screen
        When I press 'calendario' button
        Then I see a calendar
        When I press the the Arrow of next month
        Then I see the next month
