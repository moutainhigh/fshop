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
package com.fshop.product.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Description: 商品图片表VO
 *
 * @author rannuo1010@gmail.com
 * @date 2020/2/22
 */
@Data
@ApiModel(value="Picture对象VO", description="商品图片表视图对象")
public class PictureVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "图片ID")
    private Long id;

    @ApiModelProperty(value = "商品ID")
    private Long productId;

    @ApiModelProperty(value = "描述")
    private String pictureDesc;

    @ApiModelProperty(value = "URL")
    private String pictureUrl;

    @ApiModelProperty(value = "是否主图：0非主图，1主图")
    private Boolean isMaster;

    @ApiModelProperty(value = "排序")
    private Integer pictureOrder;

    @ApiModelProperty(value = "是否有效：0无效，1有效")
    private Integer pictureStatus;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime gmtModified;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime gmtCreate;


}
