## Bug Report 03

### Bug ID
BUG-003

### Title
User can proceed to the checkout information page with an empty cart.

### Module
Cart

### Environment
- Browser: Chrome (latest)
- OS: Windows 11
- Application: Web Application

### Severity
Major

### Priority
High

### Description
When a user clicks the **Cart** button on the **All Items** page and navigates to the **Cart** page, clicking the **Checkout** button while the cart is empty allows the user to proceed to the **Checkout: Your Information** page. The system should prevent users from proceeding to checkout when the cart is empty.

### Preconditions
- User is logged in.
- User has access to the All Products page.

### Steps to Reproduce
1. Log in using problem_user as the user name and the secret_sauce as the password.
2. Navigate to the **All Items** page.
2. Click the **Cart** button on the right corner of the **All Items** page.
3. Navigate to the **Cart** page.
4. Click the **Checkout** button.

### Expected Result
The system should prevent the user from proceeding to checkout when the cart is empty and display an appropriate validation message or disable the **Checkout** button.

### Actual Result
The system navigates to the **Checkout: Your Information** page even though the cart is empty.

### Reproducibility
Always (100%)

### Attachments
- https://drive.google.com/drive/home?dmr=1&ec=wgc-drive-%5Bmodule%5D-goto
