package utils

import (
	"fmt"
	"io/ioutil"
	"path/filepath"
)

func WriteJSON(filename string, data []byte) (err error) {
	return
}

func WriteFile(filename string, data []byte) (err error) {
	err = ioutil.WriteFile(filename, data, 0755)
	if err != nil {
		return
	}

	abs, err := filepath.Abs(fmt.Sprintf("./%s", filename))
	if err == nil {
		fmt.Println("Absolute File Path:", abs)
	}
	return
}
