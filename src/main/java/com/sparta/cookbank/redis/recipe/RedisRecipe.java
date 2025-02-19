package com.sparta.cookbank.redis.recipe;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Builder
@RedisHash(value = "recipe", timeToLive = 3600) // 3600s
public class RedisRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String RCP_NM;

    @Column
    private String RCP_WAY2;//방법 ex)끓이기

    @Column
    private String RCP_PAT2;//요리종류 ex)반찬

    @Column
    private Long INFO_ENG;//열량

    @Column
    private Long INFO_CAR;//탄수화물

    @Column
    private Long INFO_PRO;//단백질

    @Column
    private Long INFO_FAT;//지방

    @Column
    private Long INFO_NA;//나트륨

    @Column
    private String ATT_FILE_NO_MAIN;//이미지경로 소

    @Column
    private String ATT_FILE_NO_MK;//이미지경로 대(썸내일)

    @Column(length=1000)
    private String RCP_PARTS_DTLS;//재료정보

    @Column
    private String MAIN_INGREDIENTS;

    @Column
    private String MANUAL01;
    @Column
    private String MANUAL_IMG01;
    @Column
    private String MANUAL02;
    @Column
    private String MANUAL_IMG02;
    @Column
    private String MANUAL03;
    @Column
    private String MANUAL_IMG03;
    @Column
    private String MANUAL04;
    @Column
    private String MANUAL_IMG04;
    @Column
    private String MANUAL05;
    @Column
    private String MANUAL_IMG05;
    @Column
    private String MANUAL06;
    @Column
    private String MANUAL_IMG06;



}
