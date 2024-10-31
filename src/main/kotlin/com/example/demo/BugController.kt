import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("something")
class BugController {
    @PutMapping
    @Operation(description = "someDescription")
    fun updateSomething(): ResponseEntity<Void> = ResponseEntity.ok().build()
}
