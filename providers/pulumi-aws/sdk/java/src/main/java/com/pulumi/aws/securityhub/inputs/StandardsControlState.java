// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardsControlState extends com.pulumi.resources.ResourceArgs {

    public static final StandardsControlState Empty = new StandardsControlState();

    /**
     * The identifier of the security standard control.
     * 
     */
    @Import(name="controlId")
    private @Nullable Output<String> controlId;

    /**
     * @return The identifier of the security standard control.
     * 
     */
    public Optional<Output<String>> controlId() {
        return Optional.ofNullable(this.controlId);
    }

    /**
     * The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
     * 
     */
    @Import(name="controlStatus")
    private @Nullable Output<String> controlStatus;

    /**
     * @return The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
     * 
     */
    public Optional<Output<String>> controlStatus() {
        return Optional.ofNullable(this.controlStatus);
    }

    /**
     * The date and time that the status of the security standard control was most recently updated.
     * 
     */
    @Import(name="controlStatusUpdatedAt")
    private @Nullable Output<String> controlStatusUpdatedAt;

    /**
     * @return The date and time that the status of the security standard control was most recently updated.
     * 
     */
    public Optional<Output<String>> controlStatusUpdatedAt() {
        return Optional.ofNullable(this.controlStatusUpdatedAt);
    }

    /**
     * The standard control longer description. Provides information about what the control is checking for.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The standard control longer description. Provides information about what the control is checking for.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
     * 
     */
    @Import(name="disabledReason")
    private @Nullable Output<String> disabledReason;

    /**
     * @return A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
     * 
     */
    public Optional<Output<String>> disabledReason() {
        return Optional.ofNullable(this.disabledReason);
    }

    /**
     * The list of requirements that are related to this control.
     * 
     */
    @Import(name="relatedRequirements")
    private @Nullable Output<List<String>> relatedRequirements;

    /**
     * @return The list of requirements that are related to this control.
     * 
     */
    public Optional<Output<List<String>>> relatedRequirements() {
        return Optional.ofNullable(this.relatedRequirements);
    }

    /**
     * A link to remediation information for the control in the Security Hub user documentation.
     * 
     */
    @Import(name="remediationUrl")
    private @Nullable Output<String> remediationUrl;

    /**
     * @return A link to remediation information for the control in the Security Hub user documentation.
     * 
     */
    public Optional<Output<String>> remediationUrl() {
        return Optional.ofNullable(this.remediationUrl);
    }

    /**
     * The severity of findings generated from this security standard control.
     * 
     */
    @Import(name="severityRating")
    private @Nullable Output<String> severityRating;

    /**
     * @return The severity of findings generated from this security standard control.
     * 
     */
    public Optional<Output<String>> severityRating() {
        return Optional.ofNullable(this.severityRating);
    }

    /**
     * The standards control ARN.
     * 
     */
    @Import(name="standardsControlArn")
    private @Nullable Output<String> standardsControlArn;

    /**
     * @return The standards control ARN.
     * 
     */
    public Optional<Output<String>> standardsControlArn() {
        return Optional.ofNullable(this.standardsControlArn);
    }

    /**
     * The standard control title.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The standard control title.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private StandardsControlState() {}

    private StandardsControlState(StandardsControlState $) {
        this.controlId = $.controlId;
        this.controlStatus = $.controlStatus;
        this.controlStatusUpdatedAt = $.controlStatusUpdatedAt;
        this.description = $.description;
        this.disabledReason = $.disabledReason;
        this.relatedRequirements = $.relatedRequirements;
        this.remediationUrl = $.remediationUrl;
        this.severityRating = $.severityRating;
        this.standardsControlArn = $.standardsControlArn;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardsControlState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardsControlState $;

        public Builder() {
            $ = new StandardsControlState();
        }

        public Builder(StandardsControlState defaults) {
            $ = new StandardsControlState(Objects.requireNonNull(defaults));
        }

        /**
         * @param controlId The identifier of the security standard control.
         * 
         * @return builder
         * 
         */
        public Builder controlId(@Nullable Output<String> controlId) {
            $.controlId = controlId;
            return this;
        }

        /**
         * @param controlId The identifier of the security standard control.
         * 
         * @return builder
         * 
         */
        public Builder controlId(String controlId) {
            return controlId(Output.of(controlId));
        }

        /**
         * @param controlStatus The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
         * 
         * @return builder
         * 
         */
        public Builder controlStatus(@Nullable Output<String> controlStatus) {
            $.controlStatus = controlStatus;
            return this;
        }

        /**
         * @param controlStatus The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
         * 
         * @return builder
         * 
         */
        public Builder controlStatus(String controlStatus) {
            return controlStatus(Output.of(controlStatus));
        }

        /**
         * @param controlStatusUpdatedAt The date and time that the status of the security standard control was most recently updated.
         * 
         * @return builder
         * 
         */
        public Builder controlStatusUpdatedAt(@Nullable Output<String> controlStatusUpdatedAt) {
            $.controlStatusUpdatedAt = controlStatusUpdatedAt;
            return this;
        }

        /**
         * @param controlStatusUpdatedAt The date and time that the status of the security standard control was most recently updated.
         * 
         * @return builder
         * 
         */
        public Builder controlStatusUpdatedAt(String controlStatusUpdatedAt) {
            return controlStatusUpdatedAt(Output.of(controlStatusUpdatedAt));
        }

        /**
         * @param description The standard control longer description. Provides information about what the control is checking for.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The standard control longer description. Provides information about what the control is checking for.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disabledReason A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
         * 
         * @return builder
         * 
         */
        public Builder disabledReason(@Nullable Output<String> disabledReason) {
            $.disabledReason = disabledReason;
            return this;
        }

        /**
         * @param disabledReason A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
         * 
         * @return builder
         * 
         */
        public Builder disabledReason(String disabledReason) {
            return disabledReason(Output.of(disabledReason));
        }

        /**
         * @param relatedRequirements The list of requirements that are related to this control.
         * 
         * @return builder
         * 
         */
        public Builder relatedRequirements(@Nullable Output<List<String>> relatedRequirements) {
            $.relatedRequirements = relatedRequirements;
            return this;
        }

        /**
         * @param relatedRequirements The list of requirements that are related to this control.
         * 
         * @return builder
         * 
         */
        public Builder relatedRequirements(List<String> relatedRequirements) {
            return relatedRequirements(Output.of(relatedRequirements));
        }

        /**
         * @param relatedRequirements The list of requirements that are related to this control.
         * 
         * @return builder
         * 
         */
        public Builder relatedRequirements(String... relatedRequirements) {
            return relatedRequirements(List.of(relatedRequirements));
        }

        /**
         * @param remediationUrl A link to remediation information for the control in the Security Hub user documentation.
         * 
         * @return builder
         * 
         */
        public Builder remediationUrl(@Nullable Output<String> remediationUrl) {
            $.remediationUrl = remediationUrl;
            return this;
        }

        /**
         * @param remediationUrl A link to remediation information for the control in the Security Hub user documentation.
         * 
         * @return builder
         * 
         */
        public Builder remediationUrl(String remediationUrl) {
            return remediationUrl(Output.of(remediationUrl));
        }

        /**
         * @param severityRating The severity of findings generated from this security standard control.
         * 
         * @return builder
         * 
         */
        public Builder severityRating(@Nullable Output<String> severityRating) {
            $.severityRating = severityRating;
            return this;
        }

        /**
         * @param severityRating The severity of findings generated from this security standard control.
         * 
         * @return builder
         * 
         */
        public Builder severityRating(String severityRating) {
            return severityRating(Output.of(severityRating));
        }

        /**
         * @param standardsControlArn The standards control ARN.
         * 
         * @return builder
         * 
         */
        public Builder standardsControlArn(@Nullable Output<String> standardsControlArn) {
            $.standardsControlArn = standardsControlArn;
            return this;
        }

        /**
         * @param standardsControlArn The standards control ARN.
         * 
         * @return builder
         * 
         */
        public Builder standardsControlArn(String standardsControlArn) {
            return standardsControlArn(Output.of(standardsControlArn));
        }

        /**
         * @param title The standard control title.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The standard control title.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public StandardsControlState build() {
            return $;
        }
    }

}
