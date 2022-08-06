package com.tanvi.recyclerpractice;

public class ModelClass {

 private int imageview1;
 private String ed_1;
 private String ed_2;
 private String ed_3;

 public ModelClass(int imageview1, String ed_1, String ed_2, String ed_3) {
  this.imageview1 = imageview1;
  this.ed_1 = ed_1;
  this.ed_2 = ed_2;
  this.ed_3 = ed_3;
 }

 public int getImageview1() {
  return imageview1;
 }

 public void setImageview1(int imageview1) {
  this.imageview1 = imageview1;
 }

 public String getEd_1() {
  return ed_1;
 }

 public void setEd_1(String ed_1) {
  this.ed_1 = ed_1;
 }

 public String getEd_2() {
  return ed_2;
 }

 public void setEd_2(String ed_2) {
  this.ed_2 = ed_2;
 }

 public String getEd_3() {
  return ed_3;
 }

 public void setEd_3(String ed_3) {
  this.ed_3 = ed_3;
 }
}
