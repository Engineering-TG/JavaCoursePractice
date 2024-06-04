import com.engineering.commerce.controllers.ProductController;
import com.engineering.commerce.controllers.ProductCategoryController;
import com.engineering.commerce.entities.Price;
import com.engineering.commerce.entities.Product;
import com.engineering.commerce.services.PriceService;

public class CommerceTrainingApplication {

	public static void main(String[] args) {
		ProductController productController = new ProductController();
		ProductCategoryController productCategoryController = new ProductCategoryController();
		PriceService priceService = new PriceService();

		// // Acciones
		// productController.getAllProducts().stream().forEach(product -> {
		// 	System.out.println(product.getName());
		// });
		// // Add product
		// productController.addProduct(new Product());

		// productController.getAllProducts().stream().forEach(product -> {
		// 	System.out.println(product.getName());
		// });
		// // Delete
		// Product productToBeDeleted = new Product();
		// productToBeDeleted.setId("2");
		// productController.deleteProduct(productToBeDeleted);

		// productController.getAllProducts().stream().forEach(product -> {
		// 	System.out.println(product.getName());
		// });

		// // Get Product by Id.
		// Product product3 = productController.getProductBySku("PROD03");
		// System.out.println(product3.getName());

		//Get all product categories
		productCategoryController.getAllProductCategories().stream().forEach(productCaregory -> {
			System.out.println(productCaregory.getName());
			System.out.println(productCaregory.getId());

		});

		System.out.println(productCategoryController.getproductCaregorybyId("2").getName());

	}

}
