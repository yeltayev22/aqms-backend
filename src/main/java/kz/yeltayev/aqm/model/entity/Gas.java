package kz.yeltayev.aqm.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "gas")
public class Gas {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hydrogen")
    private BigDecimal hydrogen;

    @Column(name = "carbon_monoxide")
    private BigDecimal carbonMonoxide;

    @Column(name = "ammonia")
    private BigDecimal ammonia;

    @Column(name = "h2s")
    private BigDecimal h2s;

    @Column(name = "date")
    private LocalDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Place place;
}
