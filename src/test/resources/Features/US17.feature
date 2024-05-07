#Reporter : Reyyan Mert
#US Priority : HIGH
  Feature: As a registered user, I want to change the password on my dashboard page.
    Scenario:Pozitif Password
      * User logs in "reyyanEmail".
      * User clicks on profile button.
      * On the Control Panel page, verify that the Change Password button appears and is clickable.
      * Enter your current "Query.2904" in the old password box, "Query.2905" in the New password box, and "Query.2905" in the Confirm password box.
      * Verify that the password has been updated.

    Scenario:Negatif Password
      * User logs in "reyyanEmail".
      * User clicks on profile button.
      * Enter your current "Query.2904" in the old password box, "Query.2906" in the New password box, and "Query.2907" in the Confirm password box.
      * Verify that Password not matched text is visible.
