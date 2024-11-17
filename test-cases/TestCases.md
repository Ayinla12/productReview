## Test Case 1: Verify Homepage Launch
- **Test Case ID**: `TC_Homepage_001`  
- **Title**: Verify that the homepage loads successfully.  
- **Description**: Ensure the browser navigates to the correct URL and displays the homepage title.  
- **Preconditions**: 
  - Browser is installed.  
  - WebDriver is configured correctly.  
- **Test Steps**:
  1. Launch the browser.
  2. Navigate to `https://automationexercise.com/`.
  3. Accept any pop-up (e.g., cookie consent).
  4. Retrieve and verify the page title.  
- **Expected Results**:  
  - The page title should be **"Automation Exercise"**.

---

## Test Case 2: Verify Navigation to All Products Page
- **Test Case ID**: `TC_ProductPage_002`  
- **Title**: Verify navigation to the 'ALL PRODUCTS' page.  
- **Description**: Ensure that clicking the "Products" button redirects to the correct URL.  
- **Preconditions**: User is on the homepage.  
- **Test Steps**:
  1. Click on the "Products" button.
  2. Verify that the user is redirected to the URL: `https://automationexercise.com/products`.  
- **Expected Results**:  
  - The URL should match the expected URL.  

---

## Test Case 3: Verify 'Write Your Review' Section Visibility
- **Test Case ID**: `TC_ReviewVisibility_003`  
- **Title**: Verify the visibility of the "Write Your Review" section.  
- **Description**: Ensure the "Write Your Review" section appears after clicking a product's "View Product" button.  
- **Preconditions**: User is on the 'ALL PRODUCTS' page.  
- **Test Steps**:
  1. Hover over a product to reveal the "View Product" button.
  2. Click on "View Product".
  3. Verify that the "Write Your Review" section is visible.  
- **Expected Results**:  
  - The "Write Your Review" section should be displayed.

---

## Test Case 4: Submit a Review
- **Test Case ID**: `TC_ReviewSubmit_004`  
- **Title**: Verify that a user can submit a review successfully.  
- **Description**: Test the functionality of submitting a review, including input fields and confirmation message.  
- **Preconditions**: User is on the product details page where the "Write Your Review" section is visible.  
- **Test Steps**:
  1. Enter a name in the "Name" field.
  2. Enter an email in the "Email" field.
  3. Enter a review in the "Review" field.
  4. Click the "Submit" button.
  5. Verify that the success message is displayed: **"Thank you for your review."**  
- **Expected Results**:  
  - The review should be submitted successfully, and a confirmation message should appear.  

---

## Test Case 5: Verify Browser Cleanup
- **Test Case ID**: `TC_BrowserCleanup_005`  
- **Title**: Verify browser closes properly after the test.  
- **Description**: Ensure the browser closes after completing the test to free resources.  
- **Preconditions**: Test execution is complete.  
- **Test Steps**:
  1. Close the browser session.  
- **Expected Results**:  
  - The browser should close without errors.
