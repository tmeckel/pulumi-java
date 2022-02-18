// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageTableCardCellResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageTableCardRowResponse {
    /**
     * Optional. List of cells that make up this row.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells;
    /**
     * Optional. Whether to add a visual divider after this row.
     * 
     */
    private final Boolean dividerAfter;

    @OutputCustomType.Constructor({"cells","dividerAfter"})
    private GoogleCloudDialogflowV2IntentMessageTableCardRowResponse(
        List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells,
        Boolean dividerAfter) {
        this.cells = Objects.requireNonNull(cells);
        this.dividerAfter = Objects.requireNonNull(dividerAfter);
    }

    /**
     * Optional. List of cells that make up this row.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> getCells() {
        return this.cells;
    }
    /**
     * Optional. Whether to add a visual divider after this row.
     * 
     */
    public Boolean getDividerAfter() {
        return this.dividerAfter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTableCardRowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells;
        private Boolean dividerAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTableCardRowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cells = defaults.cells;
    	      this.dividerAfter = defaults.dividerAfter;
        }

        public Builder setCells(List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells) {
            this.cells = Objects.requireNonNull(cells);
            return this;
        }

        public Builder setDividerAfter(Boolean dividerAfter) {
            this.dividerAfter = Objects.requireNonNull(dividerAfter);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageTableCardRowResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageTableCardRowResponse(cells, dividerAfter);
        }
    }
}
