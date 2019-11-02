package cn.zhixiangsingle.entity.base.job;

import cn.zhixiangsingle.entity.base.common.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Table;

/**
 * All rights Reserved, Designed By www.zhixiangyun.net
 *
 * @version V1.0
 * @Title: zhixiangpingtai
 * @Package cn.zhixiangsingle.entity.base.job
 * @Description: ${todo}
 * @author: hhp
 * @date: 2019/8/30 18:00
 * @Copyright: 2019 www.zhixiangyun.net Inc. All rights reserved.
 * 注意：本内容仅限于浙江智飨科技内部传阅，禁止外泄以及用于其他的商业目
 */
@Data
@ToString
@Table(name="profession")
public class Profession extends BaseEntity {
    private String name;
    private Integer sdId;
}
