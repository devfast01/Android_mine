"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var tslib_1 = require("tslib");
var react_1 = tslib_1.__importDefault(require("react"));
var styled_components_1 = tslib_1.__importDefault(require("styled-components"));
var StyledChevronUp = styled_components_1.default.i(templateObject_1 || (templateObject_1 = tslib_1.__makeTemplateObject(["\n  &{box-sizing:border-box;position:relative;display:block;transform:scale(var(--ggs,1));width:22px;height:22px;border:2px solid transparent;border-radius:100px}&::after{content:\"\";display:block;box-sizing:border-box;position:absolute;width:10px;height:10px;border-top:2px solid;border-right:2px solid;transform:rotate(-45deg);left:4px;bottom:2px}\n"], ["\n  &{box-sizing:border-box;position:relative;display:block;transform:scale(var(--ggs,1));width:22px;height:22px;border:2px solid transparent;border-radius:100px}&::after{content:\"\";display:block;box-sizing:border-box;position:absolute;width:10px;height:10px;border-top:2px solid;border-right:2px solid;transform:rotate(-45deg);left:4px;bottom:2px}\n"])));
exports.ChevronUp = react_1.default.forwardRef(function (props, ref) {
    return (react_1.default.createElement(react_1.default.Fragment, null,
        react_1.default.createElement(StyledChevronUp, tslib_1.__assign({}, props, { ref: ref, "icon-role": "chevron-up" }))));
});
var templateObject_1;
//# sourceMappingURL=ChevronUp.js.map