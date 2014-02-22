package qoo.domain;

import com.google.common.base.Objects;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Member extends AbstractPersistable<Integer> {

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String password;

    @Enumerated(EnumType.STRING)
    private MemberLevel memberLevel;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date createdAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public MemberLevel getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(MemberLevel memberLevel) {
        this.memberLevel = memberLevel;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("id", getId()).add("name", getName()).add("memberLevel", getMemberLevel().toString()).toString();
    }
}
