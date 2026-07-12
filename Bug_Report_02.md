## Bug Report 02

### Bug ID
BUG-002

### Title
"Remove" button does not revert to "Add to Cart" to remove a product from the cart.

### Module
All Items Page

### Environment
- Browser: Chrome (latest)
- OS: Windows 11
- Application: Web Application

### Severity
Major

### Priority
High

### Description
## Description

When a user clicks the **Add to Cart** button on a product card, the product is successfully added to the cart, and the button correctly changes to **Remove**. However, when the user clicks the **Remove** button, the product is not removed from the cart, and the button does not change back to **Add to Cart**.

### Preconditions
- User is on the All Products page.
- At least one product is available.

### Steps to Reproduce
1. Log in using problem_user as the user name and the secret_sauce as the password.
2. Navigate to the **All Items** page.
2. Click the **Add to Cart** button for any product.
3. Verify that the button changes to **Remove**.
4. Click the **Remove** button.

### Expected Result
The selected product should be removed from the cart, and the button should change back to **Add to Cart**.

### Actual Result
The product is not removed from the cart, and the button remains as **Remove** instead of changing back to **Add to Cart**.

### Reproducibility
Always (100%)

### Attachments
- https://drive.google.com/drive/home?dmr=1&ec=wgc-drive-%5Bmodule%5D-goto