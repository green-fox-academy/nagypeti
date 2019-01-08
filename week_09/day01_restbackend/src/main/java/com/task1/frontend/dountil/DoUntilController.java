package com.task1.frontend.dountil;

import com.task1.frontend.error.Error;
import com.task1.frontend.log.Log;
import com.task1.frontend.log.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

  @Autowired
  private LogServiceImpl logService;

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable String action, @RequestBody UntilDto untilDto) {
    if (action.equals("sum")) {
      DoUntil sumUntil = new DoUntil();
      sumUntil.setResult(sumUntil.sum(untilDto.until));
      logService.createLog(new Log("/dountil/sum", String.format("until=%s", untilDto.until)));
      return sumUntil;
    } else if (action.equals(("factor"))) {
      DoUntil facUntil = new DoUntil();
      facUntil.setResult(facUntil.refactor(untilDto.until));
      logService.createLog(new Log("/dountil/factor", String.format("until=%s", untilDto.until)));
      return facUntil;
    } else {
      return new Error("Please provide a number!");
    }
  }
}
