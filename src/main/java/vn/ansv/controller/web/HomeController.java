package vn.ansv.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerOfWeb")
public class HomeController {

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");
		return mav;
	}
	
	
	@RequestMapping(value = "/ve-chung-toi", method = RequestMethod.GET)
	public ModelAndView aboutPage() {
		String title = "Về chúng tôi";
		ModelAndView mav = new ModelAndView("web/about_us","title",title);
		return mav;
	}
	
	@RequestMapping(value = "/to-chuc", method = RequestMethod.GET)
	public ModelAndView structurePage() {
		String title = "Tổ chức";
		ModelAndView mav = new ModelAndView("web/structure","title",title);
		return mav;
	}
	
	@RequestMapping(value = "/lich-su", method = RequestMethod.GET)
	public ModelAndView historyPage() {
		String title="Lịch sử phát triển";
		ModelAndView mav = new ModelAndView("web/history","title",title);
		return mav;
	}
	
	@RequestMapping(value = "/khach-hang", method = RequestMethod.GET)
	public ModelAndView clientPage() {
		String title = "Khách hàng";
		ModelAndView mav = new ModelAndView("web/client","title",title);
		return mav;
	}
	@RequestMapping(value = "/san-pham-thuong-mai", method = RequestMethod.GET)
	public ModelAndView productCommerPage() {
		String title="Sản phẩm thương mại";
		ModelAndView mav = new ModelAndView("web/product-commer","title",title);
		return mav;
		
	}
	@RequestMapping(value = "/san-pham-cong-nghe-cong-nghiep", method = RequestMethod.GET)
	public ModelAndView productInformationPage() {
		String title="Sản phẩm Công nghệ Công nghiệp";
		ModelAndView mav = new ModelAndView("web/product_information","title",title);
		return mav;
		
	}
	@RequestMapping(value = "/du-an-tieu-bieu", method = RequestMethod.GET)
	public ModelAndView hightlightPage() {
		String title="Dự án tiêu biểu";
		ModelAndView mav = new ModelAndView("web/hightlight","title",title);
		return mav;
		
	}
	@RequestMapping(value = "/chuyen-nganh-vien-thong", method = RequestMethod.GET)
	public ModelAndView telecomPage() {
		String title="Chuyên ngành viễn thông";
		ModelAndView mav = new ModelAndView("web/telecom","title",title);
		return mav;
		
	}
	@RequestMapping(value = "/cong-nghe-thong-tin", method = RequestMethod.GET)
	public ModelAndView ifTechnologyPage() {
		String title="Công nghệ thông tin";
		ModelAndView mav = new ModelAndView("web/if_technology","title",title);
		return mav;
		
	}
	@RequestMapping(value = "/chuyen-doi-so", method = RequestMethod.GET)
	public ModelAndView nbConvertPage() {
		String title="Chuyển đổi số";
		ModelAndView mav = new ModelAndView("web/nb_convert","title",title);
		return mav;
		
	}
}
