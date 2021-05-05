package pl.pjatk.pawbad;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

    @GetMapping("/{anything}")
    public ResponseEntity<String> returnAnything(@PathVariable String anything) {
        return ResponseEntity.ok(anything);
    }

    @GetMapping("/anything")
    public ResponseEntity<String> returnAnythingButLongerMethodName(@RequestParam String anything) {
        return ResponseEntity.ok(anything);
    }

    @PutMapping("/update/{someValue}")
    public ResponseEntity<String> updateAway(@RequestBody String otherValue, @PathVariable String someValue) {
        String result = "RequestBody: " + otherValue + "\nPathVariable: " + someValue;
        return ResponseEntity.ok(result);
    }

    @PostMapping("/post")
    public ResponseEntity<String> postAway(@RequestBody String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @DeleteMapping("/del/{someValue}")
    public ResponseEntity<Void> deleteEvenAwayer(@PathVariable String someValue) {
        return ResponseEntity.ok().build();
    }
}
