## Bug Report 01

### Bug ID
BUG-001

### Title
Sorting dropdown on the All Products page does not update the product list.

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
The sorting dropdown on the right side of the **All Items** page is not functioning correctly. When a user selects any sorting option, the product list remains unchanged instead of being sorted based on the selected criteria.

### Preconditions
- User is on the All Items page.
- Multiple products are available for sorting.

### Steps to Reproduce
1. Log in using problem_user as the user name and the secret_sauce as the password.
2. Navigate to the **All Items** page.
2. Click the sorting dropdown located on the right side.
3. Select any of the following options:
    - Price (Low to High)
    - Price (High to Low)
    - Name (A to Z)
    - Name (Z to A)

### Expected Result
The product list should be reordered according to the selected sorting option.

### Actual Result
The product list does not change after selecting any sorting option.

### Reproducibility
Always (100%)

### Attachments
- https://drive.google.com/drive/home?dmr=1&ec=wgc-drive-%5Bmodule%5D-goto