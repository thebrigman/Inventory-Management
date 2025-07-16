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

## Task F
Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
• The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

> mainscreen.html:
>- Lines 21-27: success and failure message added
>- Line 96: buynow button added

> AddProductController:
>- Lines 178 - 196: created a buyProduct method with buyproduct GET endpoint in AddProductController.
   (buyProduct fetches the id of the product decrements the inventory and sends success message.
   If inventory is 0, a failure message is sent. The message is displayed in mainscreen.html)

## Task G
Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

> validators/ValidInventory.java and validators/InventoryValidator.java created.

> Part.java:
>- lines 37-43: maxInv and minInv fields added
>- lines 66-81: getters and setters for maxInv and minInv
>- line 25: @ValidInventory added for validaton

> Bootstrap.Java
> lines 49,50,59,60,69,70,80,81,91,92: added set minInv and maxInv for sample inventory

> mainscreen.html:
>- lines 49,50,59,60: added max and min inventory to ingredients table

> InhousePartForm.html:
>- lines 24-30: max inventory and min inventory inputs added with p tag to display error message
>- lines 34-39: p tag to display all error messages

> OutsourcedPartForm.html:
>- lines 25-31: max inventory and min inventory inputs added with p tag to display error message
>- lines 35-40: p tag to display all error messages
