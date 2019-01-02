package diabloapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import diabloapi.Item;
import diabloapi.Fonctions;

@RestController
public class DiabloAPIController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private ArrayList<Item> Items_List = Fonctions.init();

    @GetMapping("/DiabloAPI/GET")
    public ArrayList<Item> Item() {
        return Items_List;
    }
    
    
    @GetMapping("/DiabloAPI/NAME/{name}")
    public ArrayList<diabloapi.Item> diabloID(@PathVariable String name) {
    	return Fonctions.search(Items_List, name);
    }
    
    @DeleteMapping("/DiabloAPI/DELETE/{id}")
    public ResponseEntity greetingDelete(@PathVariable int id) {
    	for (Iterator<Item> i = Items_List.iterator(); i.hasNext();) {
    	    Item item = i.next();
    	    if(item.getId() == id) Items_List.remove(item);
    	}
    	return ResponseEntity.status(HttpStatus.OK).build();
    }

    
    @PostMapping("/DiabloAPI/POST")
    public Item newItem(@RequestBody Item newItem) throws Exception {
    	for (Iterator<Item> i = Items_List.iterator(); i.hasNext();) {
    		if(!i.hasNext()) {
    	    	Item item = i.next();
    	    	int lastID = item.getId();
    	    	newItem.setId(lastID+1);
    	    }
    	}
    	Items_List.add(newItem);
    	return newItem;
    }
}
