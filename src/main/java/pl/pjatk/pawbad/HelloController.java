package pl.pjatk.pawbad;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class HelloController {


    @GetMapping("/hello")
    public ResponseEntity<String> hiArek() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<CarModel> getCar() {
        return ResponseEntity.ok(new CarModel("Ferrari","430"));
    }

    @GetMapping("/hello/{anything}")
    public ResponseEntity<String> returnAnything(@PathVariable String anything) {
        return ResponseEntity.ok(anything);
    }

    @GetMapping("/hello/abc")
    public ResponseEntity<String> requestAnything(@RequestParam String someValue) {
        return ResponseEntity.ok(someValue);
    }
}
