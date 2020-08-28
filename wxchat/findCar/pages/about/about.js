// pages/about/about.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    about: ["../../image/wechar.png","../../image/wechar.png"]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },
  preview: function(e){
    let url = e.currentTarget.dataset.url;
    console.log(url);
    wx.previewImage({
      urls: ["../../image/wechar.png", "../../image/wechar.png"],
      current: url,
      success: function(res){
        console.log(res);
      }
    })
  }
})