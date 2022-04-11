// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray;

import io.pulumi.awsnative.xray.inputs.SamplingRuleRecordArgs;
import io.pulumi.awsnative.xray.inputs.SamplingRuleUpdateArgs;
import io.pulumi.awsnative.xray.inputs.TagsItemPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SamplingRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SamplingRuleArgs Empty = new SamplingRuleArgs();

    @Import(name="ruleName")
      private final @Nullable Output<String> ruleName;

    public Output<String> getRuleName() {
        return this.ruleName == null ? Codegen.empty() : this.ruleName;
    }

    @Import(name="samplingRule")
      private final @Nullable Output<io.pulumi.awsnative.xray.inputs.SamplingRuleArgs> samplingRule;

    public Output<io.pulumi.awsnative.xray.inputs.SamplingRuleArgs> getSamplingRule() {
        return this.samplingRule == null ? Codegen.empty() : this.samplingRule;
    }

    @Import(name="samplingRuleRecord")
      private final @Nullable Output<SamplingRuleRecordArgs> samplingRuleRecord;

    public Output<SamplingRuleRecordArgs> getSamplingRuleRecord() {
        return this.samplingRuleRecord == null ? Codegen.empty() : this.samplingRuleRecord;
    }

    @Import(name="samplingRuleUpdate")
      private final @Nullable Output<SamplingRuleUpdateArgs> samplingRuleUpdate;

    public Output<SamplingRuleUpdateArgs> getSamplingRuleUpdate() {
        return this.samplingRuleUpdate == null ? Codegen.empty() : this.samplingRuleUpdate;
    }

    @Import(name="tags")
      private final @Nullable Output<List<TagsItemPropertiesArgs>> tags;

    public Output<List<TagsItemPropertiesArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public SamplingRuleArgs(
        @Nullable Output<String> ruleName,
        @Nullable Output<io.pulumi.awsnative.xray.inputs.SamplingRuleArgs> samplingRule,
        @Nullable Output<SamplingRuleRecordArgs> samplingRuleRecord,
        @Nullable Output<SamplingRuleUpdateArgs> samplingRuleUpdate,
        @Nullable Output<List<TagsItemPropertiesArgs>> tags) {
        this.ruleName = ruleName;
        this.samplingRule = samplingRule;
        this.samplingRuleRecord = samplingRuleRecord;
        this.samplingRuleUpdate = samplingRuleUpdate;
        this.tags = tags;
    }

    private SamplingRuleArgs() {
        this.ruleName = Codegen.empty();
        this.samplingRule = Codegen.empty();
        this.samplingRuleRecord = Codegen.empty();
        this.samplingRuleUpdate = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamplingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ruleName;
        private @Nullable Output<io.pulumi.awsnative.xray.inputs.SamplingRuleArgs> samplingRule;
        private @Nullable Output<SamplingRuleRecordArgs> samplingRuleRecord;
        private @Nullable Output<SamplingRuleUpdateArgs> samplingRuleUpdate;
        private @Nullable Output<List<TagsItemPropertiesArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SamplingRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleName = defaults.ruleName;
    	      this.samplingRule = defaults.samplingRule;
    	      this.samplingRuleRecord = defaults.samplingRuleRecord;
    	      this.samplingRuleUpdate = defaults.samplingRuleUpdate;
    	      this.tags = defaults.tags;
        }

        public Builder ruleName(@Nullable Output<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Codegen.ofNullable(ruleName);
            return this;
        }
        public Builder samplingRule(@Nullable Output<io.pulumi.awsnative.xray.inputs.SamplingRuleArgs> samplingRule) {
            this.samplingRule = samplingRule;
            return this;
        }
        public Builder samplingRule(@Nullable io.pulumi.awsnative.xray.inputs.SamplingRuleArgs samplingRule) {
            this.samplingRule = Codegen.ofNullable(samplingRule);
            return this;
        }
        public Builder samplingRuleRecord(@Nullable Output<SamplingRuleRecordArgs> samplingRuleRecord) {
            this.samplingRuleRecord = samplingRuleRecord;
            return this;
        }
        public Builder samplingRuleRecord(@Nullable SamplingRuleRecordArgs samplingRuleRecord) {
            this.samplingRuleRecord = Codegen.ofNullable(samplingRuleRecord);
            return this;
        }
        public Builder samplingRuleUpdate(@Nullable Output<SamplingRuleUpdateArgs> samplingRuleUpdate) {
            this.samplingRuleUpdate = samplingRuleUpdate;
            return this;
        }
        public Builder samplingRuleUpdate(@Nullable SamplingRuleUpdateArgs samplingRuleUpdate) {
            this.samplingRuleUpdate = Codegen.ofNullable(samplingRuleUpdate);
            return this;
        }
        public Builder tags(@Nullable Output<List<TagsItemPropertiesArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<TagsItemPropertiesArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(TagsItemPropertiesArgs... tags) {
            return tags(List.of(tags));
        }        public SamplingRuleArgs build() {
            return new SamplingRuleArgs(ruleName, samplingRule, samplingRuleRecord, samplingRuleUpdate, tags);
        }
    }
}
