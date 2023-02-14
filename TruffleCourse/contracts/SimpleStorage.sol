//SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;

contract simple{

uint a = 10;

function setter(uint num) public {
    a = num;
}

function getter() public view returns(uint){
    return a;
} 



}