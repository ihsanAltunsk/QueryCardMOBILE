#Reporter : Reyyan Mert
#US Priority : HIGH
  Feature: As a registered user, I want to change the password on my dashboard page.

Scenario:Pozitif Password

  * User clicks on profile button.
  * Verify that the Change Password button is visible on the Dashboard page.
  * Click the Change Password button.
  * On the Change Password page, verify that the Old password, New password, Confirm password text boxes are visible.
  * On the Change Password page, click the Old password box.
  * Enter your current password in the Old password box.
  * Enter the new password in the New password box.
  * Enter the new password in the Confirm password box.
  * Press the Save Changes button.
  * Verify that the password has been updated.


  Scenario:Negatif Password

    * User clicks on profile button.
    * On the Change Password page, click the Old password box.
    * Enter your current password in the Old password box.
    * Enter the new password in the New password box.
    * Enter the invalid password in the Confirm password box.
    * Verify that Password not matched text is visible.
