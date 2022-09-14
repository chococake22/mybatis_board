package com.example.chococake.util;

import lombok.Data;

@Data
public class PagingVo {

    private int nowPage;    // 현재 페이지
    private int startPage;  // 시작 페이지
    private int endPage;    // 끝 페이지
    private int total;  // 총 게시글의 개수
    private int cntPerPage; // 페이지당 글 개수
    private int lastPage;   // 마지막 페이지
    private int start;  // 쿼리용 start
    private int end;    // 쿼리용 end

    private int cntPage = 5;

    public PagingVo(int total, int nowPage, int cntPerPage) {
        this.nowPage = nowPage;
        this.cntPerPage = cntPerPage;
        this.total = total;

    }

    // 가장 마지막 페이지 계산
    public void calcLastPage(int total, int cntPerPage) {
        setLastPage((int) Math.ceil((double) total / (double) cntPerPage));
    }

    // 시작, 끝 페이지 계산
    public void calcStartEndPage(int nowPage, int cntPage) {
        setEndPage(((int) Math.ceil((double) nowPage / (double) cntPage)) * cntPage);
        if (getLastPage() < getEndPage()) {
            setEndPage(getLastPage());
        }
        setStartPage(getEndPage() - cntPage + 1);
        if (getStartPage() < 1) {
            setStartPage(1);
        }
    }

    // DB 쿼리에서 사용할 start, end 값 계산하기
    public void calcStartEnd(int nowPage, int cntPerPage) {
        setEnd(nowPage * cntPerPage);
        setStart(getEnd() - cntPerPage + 1);
    }
}
