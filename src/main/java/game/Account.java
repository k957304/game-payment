package game;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Account_table")
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name="giftId")
    private Long giftId;
    @Column(name="giftStatus")
    private String giftStatus;

    public String getGiftStatus() {
        return giftStatus;
    }

    public void setGiftStatus(String giftStatus) {
        this.giftStatus = giftStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

}
