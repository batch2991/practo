Feature: To test the Online appointments of Doctor

Scenario: To verify the doctor details and fees matches
Given user is on homepage
When enter city to search
And enter speciality and click search
And click on any one of the doctor
Then verify doctorname fees and year of exp is correct in next page

Scenario: To validate the slot details
Given user is on doctors list page
When click on Tomorrow
And click on one of the slot
Then the slot selected and visible slot in next page is same