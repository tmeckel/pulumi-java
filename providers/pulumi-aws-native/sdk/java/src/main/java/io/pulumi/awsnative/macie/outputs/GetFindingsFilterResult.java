// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie.outputs;

import io.pulumi.awsnative.macie.enums.FindingsFilterFindingFilterAction;
import io.pulumi.awsnative.macie.outputs.FindingsFilterFindingCriteria;
import io.pulumi.awsnative.macie.outputs.FindingsFilterListItem;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFindingsFilterResult {
    /**
     * Findings filter action.
     * 
     */
    private final @Nullable FindingsFilterFindingFilterAction action;
    /**
     * Findings filter ARN.
     * 
     */
    private final @Nullable String arn;
    /**
     * Findings filter description
     * 
     */
    private final @Nullable String description;
    /**
     * Findings filter criteria.
     * 
     */
    private final @Nullable FindingsFilterFindingCriteria findingCriteria;
    /**
     * Findings filters list.
     * 
     */
    private final @Nullable List<FindingsFilterListItem> findingsFilterListItems;
    /**
     * Findings filter ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Findings filter name
     * 
     */
    private final @Nullable String name;
    /**
     * Findings filter position.
     * 
     */
    private final @Nullable Integer position;

    @OutputCustomType.Constructor
    private GetFindingsFilterResult(
        @OutputCustomType.Parameter("action") @Nullable FindingsFilterFindingFilterAction action,
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("findingCriteria") @Nullable FindingsFilterFindingCriteria findingCriteria,
        @OutputCustomType.Parameter("findingsFilterListItems") @Nullable List<FindingsFilterListItem> findingsFilterListItems,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("position") @Nullable Integer position) {
        this.action = action;
        this.arn = arn;
        this.description = description;
        this.findingCriteria = findingCriteria;
        this.findingsFilterListItems = findingsFilterListItems;
        this.id = id;
        this.name = name;
        this.position = position;
    }

    /**
     * Findings filter action.
     * 
    */
    public Optional<FindingsFilterFindingFilterAction> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * Findings filter ARN.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Findings filter description
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Findings filter criteria.
     * 
    */
    public Optional<FindingsFilterFindingCriteria> getFindingCriteria() {
        return Optional.ofNullable(this.findingCriteria);
    }
    /**
     * Findings filters list.
     * 
    */
    public List<FindingsFilterListItem> getFindingsFilterListItems() {
        return this.findingsFilterListItems == null ? List.of() : this.findingsFilterListItems;
    }
    /**
     * Findings filter ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Findings filter name
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Findings filter position.
     * 
    */
    public Optional<Integer> getPosition() {
        return Optional.ofNullable(this.position);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFindingsFilterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FindingsFilterFindingFilterAction action;
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable FindingsFilterFindingCriteria findingCriteria;
        private @Nullable List<FindingsFilterListItem> findingsFilterListItems;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer position;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFindingsFilterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.findingCriteria = defaults.findingCriteria;
    	      this.findingsFilterListItems = defaults.findingsFilterListItems;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.position = defaults.position;
        }

        public Builder action(@Nullable FindingsFilterFindingFilterAction action) {
            this.action = action;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder findingCriteria(@Nullable FindingsFilterFindingCriteria findingCriteria) {
            this.findingCriteria = findingCriteria;
            return this;
        }

        public Builder findingsFilterListItems(@Nullable List<FindingsFilterListItem> findingsFilterListItems) {
            this.findingsFilterListItems = findingsFilterListItems;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder position(@Nullable Integer position) {
            this.position = position;
            return this;
        }
        public GetFindingsFilterResult build() {
            return new GetFindingsFilterResult(action, arn, description, findingCriteria, findingsFilterListItems, id, name, position);
        }
    }
}
