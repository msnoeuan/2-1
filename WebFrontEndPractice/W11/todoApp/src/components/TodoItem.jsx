// ./src/components/TodoItem
import "../css/TodoItem.css"

function TodoItem({id, content, isDone, createdDate, onUpdate, onDelete}) {
    const onChangeCheckbox = () => onUpdate(id)
    const onClickDelete = () => onDelete(id);
    
    return (
        <div className = "TodoItem">
            <div className = "checkbox_col">
                <input onChange = {onChangeCheckbox} checked = {isDone} type = "checkbox" />
            </div>

            <div classNaame = "title_col">{content}</div>
            <div classNaame = "date_col">{new Date(createdDate).toLocaleDateString()}</div>

            <div className = "btn_col">
                <button onClick = {onClickDelete}>삭제</button>
            </div>
        </div>
    )
}

export default TodoItem