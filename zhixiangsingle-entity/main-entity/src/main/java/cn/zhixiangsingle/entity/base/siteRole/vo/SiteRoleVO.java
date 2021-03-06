package cn.zhixiangsingle.entity.base.siteRole.vo;

import cn.zhixiangsingle.entity.base.common.vo.BaseVO;
import cn.zhixiangsingle.entity.base.siteRolePermission.SiteRolePermissionKey;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * All rights Reserved, Designed By www.zhixiangyun.net
 *
 * @version V1.0
 * @Title: zhixiangpingtai
 * @Package cn.zhixiangsingle.base.siteRole.vo
 * @Description: ${todo}
 * @author: hhp
 * @date: 2019/8/23 11:01
 * @Copyright: 2019 www.zhixiangyun.net Inc. All rights reserved.
 * 注意：本内容仅限于浙江智飨科技内部传阅，禁止外泄以及用于其他的商业目
 */
@Data
@ToString
public class SiteRoleVO extends BaseVO {
    private Integer id;
    private String roleName;
    private String descpt;
    private String code;
    private Integer insertUid;
    private String insertTime;
    private List<SiteRolePermissionKey> siteRolePerms;
}
