Feature: SignIn

Description: As a user i want to SignIn so that i can successfully Sign in.

Scenario: Positive

Given I am in Sign In page

When  I click sign in button in home page
And i enter valid user name 
And i enter valid password
And i click Sign in button


Then I successfully Sign In
