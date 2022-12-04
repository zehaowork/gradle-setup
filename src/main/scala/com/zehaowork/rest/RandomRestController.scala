package com.zehaowork.rest

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class RandomRestController {
  @GetMapping(path = Array("/random"))
  def randomController(): Double = {
    math.random
  }
}
