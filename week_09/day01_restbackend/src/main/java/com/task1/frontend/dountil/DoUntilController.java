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
    DoUntilService calcUntil = new DoUntilService();
    if (action.equals("sum")) {
      calcUntil.setResult(calcUntil.sum(untilDto.until));
    } else if (action.equals(("factor"))) {
      calcUntil.setResult(calcUntil.factor(untilDto.until));
    } else {
      return new Error("Please provide a number!");
    }
    logService.createLog(new Log("/dountil/" + action, String.format("until=%s", untilDto.until)));
    return calcUntil;
  }

}
