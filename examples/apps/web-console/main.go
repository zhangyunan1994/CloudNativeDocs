package main

import (
	"net/http"

	"github.com/gin-gonic/gin"
)

func main() {
	gin.SetMode(gin.DebugMode)
	r := gin.Default()
	r.GET("/health", func(c *gin.Context) {
		c.JSON(http.StatusOK, gin.H{
			"Status":      "UP",
			"ServiceName": "Web Console",
			"Desc":        "一个简单的 Web 项目，类似于常见的管理后台项目",
		})
	})
	r.Run(":20000")
}
