package kodlama.io.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.northwind.business.abstracts.ProductService;
import kodlama.io.northwind.core.utilities.results.DataResult;
import kodlama.io.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products") // servlet gibi
//burhanmutlu.tech/api/products
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired // ProductManager p = new ProductManager(); 
	//bizim yerimize bunu yapıyor 
	//productservice productmanageri implement ediyor o yüzden
	//p nesnesini aşağıda yerine yazıyor. interfaceden nesne oluşmaz
	//ileride değiştirmek için veya test için interface kullanıyoruz
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping("/getall")
	public DataResult<List<Product>> getAll() {
		//burhanmutlu.tech/api/products/getall sitesinde bu fonk çağrılacak
		
		return this.productService.getAll();
		
	}

}
