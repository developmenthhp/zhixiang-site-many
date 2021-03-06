package cn.zhixiangsingle.component;

import cn.zhixiangsingle.service.redis.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * All rights Reserved, Designed By www.zhixiangyun.net
 *
 * @version V1.0
 * @Title: zhixiangpingtai
 * @Package cn.zhixiangsingle.impl.redis
 * @Description: ${todo}
 * @author: hhp
 * @date: 2019/10/29 10:03
 * @Copyright: 2019 www.zhixiangyun.net Inc. All rights reserved.
 * 注意：本内容仅限于浙江智飨科技内部传阅，禁止外泄以及用于其他的商业目
 */
@Service
public class RedisServiceImpl implements RedisService {
    @Resource(name = "redisTemplate2")
    private RedisTemplate<String, Object> redisTemplate;
    /**
     * @version V1.0
     * @Title: zhixiangpingtai
     * @Description:
     * @author: hhp
     * @param:  * @param key
     * @param value
     * @date: 2019/10/14 19:06
     */
    @Override
    public void set(String key, Object value) {
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        vo.set(key, value);
    }
    /**
     * @version V1.0
     * @Title: zhixiangpingtai
     * @Description:
     * @author: hhp
     * @param:  * @param key
     * @date: 2019/10/14 19:06
     */
    @Override
    public Object get(String key) {
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }
}
