import com.engineering.commerce.controllers.ProductController;
import com.engineering.commerce.entities.Product;

public class CommerceTrainingApplication {

	public static void main(String[] args) {
		ProductController productController = new ProductController();

		// Acciones
		productController.getAllProducts().stream().forEach(product -> {
			System.out.println(product.getName());
		});
		// Add product
		productController.addProduct(new Product());

		productController.getAllProducts().stream().forEach(product -> {
			System.out.println(product.getName());
		});
		// Delete
		Product productToBeDeleted = new Product();
		productToBeDeleted.setId("2");
		productController.deleteProduct(productToBeDeleted);

		productController.getAllProducts().stream().forEach(product -> {
			System.out.println(product.getName());
		});

		// Get Product by Id.
		Product product3 = productController.getProductBySku("PROD03");
		System.out.println(product3.getName());
		// GetPrices
	}

}
