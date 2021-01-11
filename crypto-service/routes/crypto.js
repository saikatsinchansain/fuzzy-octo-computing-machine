var express = require('express');
var router = express.Router();

/* GET users listing. */
router.get('/', function(req, res, next) {
  res.send('Welcome to crypto Service');
});

/* GET users listing. */
router.get('/client/', function(req, res, next) {
  res.send('Node JS');
});

module.exports = router;
