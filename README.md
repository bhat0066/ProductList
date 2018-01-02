<H1>Problem</H1>
You're a successful Shopify merchant! Your inventory has grown so much that you can’t keep track of them with your fingers anymore. Create a mobile app that displays a list of all the products your store sells. You want to quickly glance at them, so the list should also have the following:

<ul>
  <li>The product image (just use the first image in the result, if there are any)</li>
  <li>The title of the product.</li>
  <li>The description of the product.</li>
 </ul>

You can access your products with this link:
https://shopicruit.myshopify.com/admin/products.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6

Note that the link is only for the first page of products (for this challenge you can ignore any additional pages). Here are a couple simple libraries that you can use to fetch the data (these are optional, you can pick one or use any other alternative):
http://square.github.io/retrofit/ (Android), http://square.github.io/okhttp/ (Android) and http://github.com/Alamofire/Alamofire (iOS)

A description of the data for each product is available in the Shopify API documentation here:
https://help.shopify.com/api/reference/product

What you need to submit:

<ol>  
  <li><p>&#10004; The first page of products with the image, title, and description.</p></li>
  <li><p>&#10004; A simple video of your app scrolling through the list up and down</p></li>
    <ol><li>If you chose to add any of the extra challenges, also include a video of those solutions.</li></ol>
  <li><p>&#10004; Your project code.</p></li>
</ol>

<H2>Extra 1</H2>
<p>&#10008; Feeling adventurous? Let's try opening a new screen when you tap on a product in the list. The screen should show the detailed information for that product https://help.shopify.com/api/reference/product#show</p>

<H2>Extra 2</H2>
<p>&#10008; Wow you are still here. How about we add search capabilities to the app? Using the same https://help.shopify.com/api/reference/product#index let’s add a search bar where we can filter our products so we can find them more easily.</p>