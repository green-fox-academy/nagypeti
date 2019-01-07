package com.task1.frontend.log;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {

  List<Log> logs();
  void createLog(Log log);

}
