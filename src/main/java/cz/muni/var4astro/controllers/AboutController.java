package cz.muni.var4astro.controllers;

import cz.muni.var4astro.dao.FluxDaoImpl;
import cz.muni.var4astro.dao.SpaceObjectDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @Autowired
    SpaceObjectDaoImpl spaceObjectDao;

    @Autowired
    FluxDaoImpl fluxDao;

    @GetMapping("/about")
    public String showAboutPage(Model model) {
        String fluxNumberFormatted = String.format("%,d", fluxDao.getNumberOfFluxesEstimate());
        String objectNumberFormatted = String.format("%,d", spaceObjectDao.getNumberOfObjectsEstimate());
        model.addAttribute("fluxNum", fluxNumberFormatted);
        model.addAttribute("objectNum", objectNumberFormatted);
        return "about";
    }
}
