package cn.jeesns.model.system;

import cn.jeesns.core.annotation.Column;
import cn.jeesns.core.annotation.Id;
import cn.jeesns.core.annotation.Table;
import cn.jeesns.core.enums.IdType;

@Table("tbl_tag")
public class Tag {
    @Id(value = "id", type = IdType.AUTO)
    private Integer id;
    @Column("name")
    private String name;
    @Column("func_type")
    private Integer funcType;
    @Column("refer_count")
    private Integer referCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFuncType() {
        return funcType;
    }

    public void setFuncType(Integer funcType) {
        this.funcType = funcType;
    }

    public Integer getReferCount() {
        return referCount;
    }

    public void setReferCount(Integer referCount) {
        this.referCount = referCount;
    }
}
