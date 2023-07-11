package com.kh.day12.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day12.music.model.vo.Music;

public class MusicController {
	List<Music> mList;
	
	public MusicController() {
		mList = new ArrayList<Music>(); 
	}
	
	/**
	 * 마지막 위치에 곡추가
	 * @param music
	 */
	public void addAtLast(Music music) {
		mList.add(music);
	}
	
	/**
	 * 첫 위치에 곡추가
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0,music);
	}
	
	/**
	 * 곡 수정하기
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}

	/**
	 * 곡 삭제하기
	 * @param i
	 */
	public void removeMusic(int i) {
				mList.remove(i);
			}

	/**
	 * 음악 전체 정보 출력
	 * @return mList
	 */
	public List<Music> printMusicList() {
		return mList;
	}

	public List<Music> searchMusicsByName(String title) {
		// 찾은 음악을 담을 리스트
		List<Music> findList = new ArrayList<Music>();
		// 기존 음악이 있는 mList에서 찾기
		for(Music mOne : mList) {
			// 입력한 이름이 같으면
			if(mOne.getTitle().equals(title)) {
				// findList에 추가하기
				findList.add(mOne);
			}
		}
		// 다 찾았으면 리턴하기
		return findList;
	}

	public int searchOneByTitle(String title) {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}

	public void insertionSortByTitleASC() {
		// 삽입정렬 연습
	}
	
	public void selectionSortByTitleASC() {
		// 선택정렬 연습
	}
	
	
	
	public void sortByTitleASC() {
//		int [] nums; -> mList로 변경 필요
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				// 결과값이
				// 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 왼쪽이 순서가 작음
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0 ) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}

	public void sortByTitleDESC() {
//		int [] nums; -> mList로 변경 필요
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				// 결과값이
				// 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 왼쪽이 순서가 작음
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0 ) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
	
	public void sortBySingerASC() {
//		int [] nums; -> mList로 변경 필요
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				// 결과값이
				// 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 왼쪽이 순서가 작음
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 0 ) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
	
	public void sortBySingerDESC() {
//		int [] nums; -> mList로 변경 필요
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				// 결과값이
				// 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 왼쪽이 순서가 작음
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 0 ) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
}

