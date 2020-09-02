/*
 * Copyright 2020 rannuo1010@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fshop.rest.model.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Description: 秒杀Query
 *
 * @author rannuo1010@gmail.com
 * @date 2020/2/22
 */
@Getter
@Setter
@ApiModel(value = "秒杀Query")
public class SeckillQuery {

    @ApiModelProperty(value = "商品ID", required = true, example = "1")
    private Long productId;

    @ApiModelProperty(value = "购买数量", required = true, example = "1")
    private Integer productNum;

    @ApiModelProperty(value = "用户ID", required = true, example = "1")
    private Long userId;

}
