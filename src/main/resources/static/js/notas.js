
function salvarNotas(alunoId) {
    var nota1 = document.querySelector('[name="nota1"][data-aluno-id="'+alunoId+'"]').value;
    var nota2 = document.querySelector('[name="nota2"][data-aluno-id="'+alunoId+'"]').value;
    var nota3 = document.querySelector('[name="nota3"][data-aluno-id="'+alunoId+'"]').value;
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/alunos/"+alunoId+"/notas", true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.onreadystatechange = function() {
      if (this.readyState == XMLHttpRequest.DONE && this.status == 200) {
        alert("Notas salvas com sucesso!");
      }
    };
    xhr.send(JSON.stringify({
      nota1: nota1,
      nota2: nota2,
      nota3: nota3
    }));
  }
