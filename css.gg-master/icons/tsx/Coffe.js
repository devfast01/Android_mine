"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var tslib_1 = require("tslib");
var react_1 = tslib_1.__importDefault(require("react"));
var styled_components_1 = tslib_1.__importDefault(require("styled-components"));
var StyledCoffe = styled_components_1.default.i(templateObject_1 || (templateObject_1 = tslib_1.__makeTemplateObject(["\n  & {\n    box-sizing: border-box;\n    position: relative;\n    display: block;\n    transform: scale(var(--ggs, 1));\n    width: 18px;\n    height: 14px;\n    border: 2px solid;\n    border-radius: 6px;\n    border-top-left-radius: 0;\n    border-top-right-radius: 0;\n    margin-left: -4px;\n    margin-top: 3px;\n  }\n  &::after,\n  &::before {\n    content: '';\n    display: block;\n    box-sizing: border-box;\n    position: absolute;\n  }\n  &::before {\n    left: 2px;\n    background: currentColor;\n    box-shadow: 4px 0 0, 8px 0 0;\n    border-radius: 3px;\n    width: 2px;\n    height: 4px;\n    top: -7px;\n  }\n  &::after {\n    width: 6px;\n    height: 8px;\n    border: 2px solid;\n    border-radius: 100px;\n    border-top-left-radius: 0;\n    border-bottom-left-radius: 0;\n    right: -6px;\n    top: -1px;\n  }\n"], ["\n  & {\n    box-sizing: border-box;\n    position: relative;\n    display: block;\n    transform: scale(var(--ggs, 1));\n    width: 18px;\n    height: 14px;\n    border: 2px solid;\n    border-radius: 6px;\n    border-top-left-radius: 0;\n    border-top-right-radius: 0;\n    margin-left: -4px;\n    margin-top: 3px;\n  }\n  &::after,\n  &::before {\n    content: '';\n    display: block;\n    box-sizing: border-box;\n    position: absolute;\n  }\n  &::before {\n    left: 2px;\n    background: currentColor;\n    box-shadow: 4px 0 0, 8px 0 0;\n    border-radius: 3px;\n    width: 2px;\n    height: 4px;\n    top: -7px;\n  }\n  &::after {\n    width: 6px;\n    height: 8px;\n    border: 2px solid;\n    border-radius: 100px;\n    border-top-left-radius: 0;\n    border-bottom-left-radius: 0;\n    right: -6px;\n    top: -1px;\n  }\n"])));
exports.Coffe = react_1.default.forwardRef(function (props, ref) {
    return (react_1.default.createElement(react_1.default.Fragment, null,
        react_1.default.createElement(StyledCoffe, tslib_1.__assign({}, props, { ref: ref, "icon-role": "coffe" }))));
});
var templateObject_1;
//# sourceMappingURL=Coffe.js.map