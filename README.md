README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.
## Task C
Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

>mainscreen.html:
>- Lines 17 - 20: Changed shop name added logo
>- Lines 24, 33 - 35, 56, 70, 71: Changed from parts and products to Ingredients and Menu Items

>InhousePartForm, OutsourcedPartForm, Product Form:
>- changed names from parts and products to ingedients and menu Items

## Task D
Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
> created about.html
>- button navigating to mainscreen.html, image, and description added

> created controllers/AboutPageController:
>- Lines 9 - 10 created endpoint to return about.html

>mainscreen.html:
>- Line 23: added button to navigate to about.html

## Task E
Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
> BootStrapData:
>- lines 42 - 98 added 5 parts and 5 products and if statement.