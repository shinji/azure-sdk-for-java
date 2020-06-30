/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a managed rule group override setting.
 */
public class ManagedRuleOverride {
    /**
     * Identifier for the managed rule.
     */
    @JsonProperty(value = "ruleId", required = true)
    private String ruleId;

    /**
     * Describes if the managed rule is in enabled or disabled state. Defaults
     * to Disabled if not specified. Possible values include: 'Disabled',
     * 'Enabled'.
     */
    @JsonProperty(value = "enabledState")
    private ManagedRuleEnabledState enabledState;

    /**
     * Describes the override action to be applied when rule matches. Possible
     * values include: 'Allow', 'Block', 'Log', 'Redirect'.
     */
    @JsonProperty(value = "action")
    private ActionType action;

    /**
     * Get identifier for the managed rule.
     *
     * @return the ruleId value
     */
    public String ruleId() {
        return this.ruleId;
    }

    /**
     * Set identifier for the managed rule.
     *
     * @param ruleId the ruleId value to set
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get describes if the managed rule is in enabled or disabled state. Defaults to Disabled if not specified. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the enabledState value
     */
    public ManagedRuleEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set describes if the managed rule is in enabled or disabled state. Defaults to Disabled if not specified. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param enabledState the enabledState value to set
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withEnabledState(ManagedRuleEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get describes the override action to be applied when rule matches. Possible values include: 'Allow', 'Block', 'Log', 'Redirect'.
     *
     * @return the action value
     */
    public ActionType action() {
        return this.action;
    }

    /**
     * Set describes the override action to be applied when rule matches. Possible values include: 'Allow', 'Block', 'Log', 'Redirect'.
     *
     * @param action the action value to set
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withAction(ActionType action) {
        this.action = action;
        return this;
    }

}