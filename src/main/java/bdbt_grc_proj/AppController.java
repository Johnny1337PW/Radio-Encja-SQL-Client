package bdbt_grc_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@Autowired
	private RadiaDAO dao;

	@RequestMapping("/login")
	public String viewHomePage8(Model model) {
		return "login";
	}
	
	
	@RequestMapping("/")
	public String viewHomePage1(Model model) {
		return "index";
	}
	@RequestMapping("/radia")
	public String viewHomePage(Model model) {

		List<Radia> listRadia = dao.list();
		model.addAttribute("listRadia", listRadia);
		return "radia";
	}

	@RequestMapping("radia/new")
	public String showNewForm(Model model) {

		Radia radia = new Radia();
		model.addAttribute("radia", radia);
		return "noweRadio";
	}

	@RequestMapping(value = "radia/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("Radia") Radia radia) {
		dao.save(radia);
		return "redirect:/radia";
	}

	@RequestMapping("radia/edit/{id}")
	public ModelAndView showEditForm(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edytujRadio");
		Radia radia = dao.get(id);
		mav.addObject("radia", radia);
		return mav;
	}

	@RequestMapping(value = "radia/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("radia") Radia radia) {
		dao.update(radia);

		return "redirect:/radia";
	}

	@RequestMapping("radia/delete/{id}")
	public String delete(@PathVariable(name = "id") int id) {
		dao.delete(id);
		return "redirect:/radia";
	}

	/* <!-- KONIEC RADIA --> */

	@Autowired
	private UtworyDAO dao1;

	@RequestMapping("/utwory")
	public String viewHomePage2(Model model) {

		List<Utwory> listUtwory = dao1.list();
		model.addAttribute("listUtwory", listUtwory);
		return "utwory";

	}

	@RequestMapping("utwory/new")
	public String showNewForm2(Model model) {

		Utwory utwory = new Utwory();
		model.addAttribute("Utwory", utwory);
		return "nowyUtwor";
	}

	@RequestMapping(value = "utwory/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("Utwory") Utwory utwory) {
		dao1.save(utwory);
		return "redirect:/utwory";
	}

	@RequestMapping("utwory/edit/{id}")
	public ModelAndView showEditForm1(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edytujUtwor");
		Utwory utwory = dao1.get(id);
		mav.addObject("utwory", utwory);
		return mav;
	}

	@RequestMapping(value = "utwory/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("utwory") Utwory utwory) {
		dao1.update(utwory);

		return "redirect:/utwory";
	}

	@RequestMapping("utwory/delete/{id}")
	public String delete1(@PathVariable(name = "id") int id) {
		dao1.delete(id);
		return "redirect:/utwory";

	}

	/* <!-- KONIEC UTWOROW --> */
	@Autowired
	private PracownicyDAO dao2;

	@RequestMapping("/pracownicy")
	public String viewHomePage3(Model model) {

		List<Pracownicy> listPracownicy = dao2.list();
		model.addAttribute("listPracownicy", listPracownicy);
		return "pracownicy";

	}

	@RequestMapping("pracownicy/new")
	public String showNewForm3(Model model) {

		Pracownicy pracownicy = new Pracownicy();
		model.addAttribute("Pracownicy", pracownicy);
		return "nowyPracownik";
	}

	@RequestMapping(value = "pracownicy/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("Pracownicy") Pracownicy pracownicy) {
		dao2.save(pracownicy);
		return "redirect:/pracownicy";
	}

	@RequestMapping("pracownicy/edit/{id}")
	public ModelAndView showEditForm2(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edytujPracownika");
		Pracownicy pracownicy = dao2.get(id);
		mav.addObject("pracownicy", pracownicy);
		return mav;
	}

	@RequestMapping(value = "pracownicy/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("pracownicy") Pracownicy pracownicy) {
		dao2.update(pracownicy);

		return "redirect:/pracownicy";
	}

	@RequestMapping("pracownicy/delete/{id}")
	public String delete2(@PathVariable(name = "id") int id) {
		dao2.delete(id);
		return "redirect:/pracownicy";

	}

	/* <!-- KONIEC PRACOWNIKOW --> */

	@Autowired
	private AudycjeDAO dao3;

	@RequestMapping("/audycje")
	public String viewHomePage4(Model model) {

		List<Audycje> listAudycje = dao3.list();
		model.addAttribute("listAudycje", listAudycje);
		return "audycje";

	}

	@RequestMapping("audycje/new")
	public String showNewForm4(Model model) {

		Audycje audycje = new Audycje();
		model.addAttribute("Audycje", audycje);
		return "nowaAudycja";
	}

	@RequestMapping(value = "audycje/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("Audycje") Audycje audycje) {
		dao3.save(audycje);
		return "redirect:/audycje";
	}

	@RequestMapping("audycje/edit/{id}")
	public ModelAndView showEditForm4(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edytujAudycje");
		Audycje audycje = dao3.get(id);
		mav.addObject("audycje", audycje);
		return mav;
	}

	@RequestMapping(value = "audycje/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("audycje") Audycje audycje) {
		dao3.update(audycje);

		return "redirect:/audycje";
	}

	@RequestMapping("audycje/delete/{id}")
	public String delete3(@PathVariable(name = "id") int id) {
		dao3.delete(id);
		return "redirect:/audycje";

	}

	/* <!-- Koniec Audycji --> */

	@Autowired
	private LicencjeDAO dao4;

	@RequestMapping("/licencje")
	public String viewHomePage5(Model model) {

		List<Licencje> listLicencje = dao4.list();
		model.addAttribute("listLicencje", listLicencje);
		return "licencje";

	}

	@RequestMapping("licencje/new")
	public String showNewForm5(Model model) {

		Licencje licencje = new Licencje();
		model.addAttribute("Licencje", licencje);
		return "nowaLicencja";
	}

	@RequestMapping(value = "licencje/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("Licencje") Licencje licencje) {
		dao4.save(licencje);
		return "redirect:/licencje";
	}

	@RequestMapping("licencje/edit/{id}")
	public ModelAndView showEditForm5(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edytujLicencje");
		Licencje licencje = dao4.get(id);
		mav.addObject("licencje", licencje);
		return mav;
	}

	@RequestMapping(value = "licencje/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("licencje") Licencje licencje) {
		dao4.update(licencje);

		return "redirect:/licencje";
	}

	@RequestMapping("licencje/delete/{id}")
	public String delete4(@PathVariable(name = "id") int id) {
		dao4.delete(id);
		return "redirect:/licencje";

	}

	/* <!-- Koniec licencje --> */

	@Autowired
	private PrzekaznikiDAO dao5;

	@RequestMapping("/przekazniki")
	public String viewHomePage6(Model model) {

		List<Przekazniki> listPrzekazniki = dao5.list();
		model.addAttribute("listPrzekazniki", listPrzekazniki);
		return "przekazniki";
	}

	@RequestMapping("przekazniki/new")
	public String showNewForm6(Model model) {

		Przekazniki przekazniki = new Przekazniki();
		model.addAttribute("Przekazniki", przekazniki);
		return "nowyPrzekaznik";
	}

	@RequestMapping(value = "przekazniki/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("Przekazniki") Przekazniki przekazniki) {
		dao5.save(przekazniki);
		return "redirect:/przekazniki";
	}

	@RequestMapping("przekazniki/edit/{id}")
	public ModelAndView showEditForm6(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edytujPrzekaznik");
		Przekazniki przekazniki = dao5.get(id);
		mav.addObject("przekazniki", przekazniki);
		return mav;
	}

	@RequestMapping(value = "przekazniki/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("przekazniki") Przekazniki przekazniki) {
		dao5.update(przekazniki);

		return "redirect:/przekazniki";
	}

	@RequestMapping("przekazniki/delete/{id}")
	public String delete5(@PathVariable(name = "id") int id) {
		dao5.delete(id);
		return "redirect:/przekazniki";

	}

	/* Koniec przekaznikow */
	
	  @Autowired
	    private StanowiskaDAO dao6;

	    @RequestMapping("/stanowiska")
	    public String viewHomePage7(Model model) {

	        List<Stanowiska> listStanowiska = dao6.list();
	        model.addAttribute("listStanowiska", listStanowiska);
	        return "stanowiska";

	    }

	    @RequestMapping("stanowiska/new")
	    public String showNewForm7(Model model) {

	        Stanowiska stanowiska = new Stanowiska();
	        model.addAttribute("Stanowiska", stanowiska);
	        return "noweStanowisko";
	    }

	    @RequestMapping(value = "stanowiska/save", method = RequestMethod.POST)
	    public String save(@ModelAttribute("Stanowiska") Stanowiska stanowiska) {
	        dao6.save(stanowiska);
	        return "redirect:/stanowiska";
	    }

	    @RequestMapping("stanowiska/edit/{id}")
	    public ModelAndView showEditForm7(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("edytujStanowisko");
	        Stanowiska stanowiska = dao6.get(id);
	        mav.addObject("stanowiska", stanowiska);
	        return mav;
	    }

	    @RequestMapping(value = "stanowiska/update", method = RequestMethod.POST)
	    public String update(@ModelAttribute("stanowiska") Stanowiska stanowiska) {
	        dao6.update(stanowiska);

	        return "redirect:/stanowiska";
	    }

	    @RequestMapping("stanowiska/delete/{id}")
	    public String delete6(@PathVariable(name = "id") int id) {
	        dao6.delete(id);
	        return "redirect:/stanowiska";
	    }
	
	
}